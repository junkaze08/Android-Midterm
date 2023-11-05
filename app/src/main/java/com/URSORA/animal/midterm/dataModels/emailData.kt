package com.URSORA.animal.midterm.dataModels

import android.os.Parcel
import android.os.Parcelable

data class emailData(val senderName: String, val emailSubject: String, val emailContent: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(senderName)
        parcel.writeString(emailSubject)
        parcel.writeString(emailContent)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<emailData> {
        override fun createFromParcel(parcel: Parcel): emailData {
            return emailData(parcel)
        }

        override fun newArray(size: Int): Array<emailData?> {
            return arrayOfNulls(size)
        }
    }
}
//<!--Identification Check: Binmcfmz Izcqza YY Affine Cipher Encoded a = 3 b = 0>
