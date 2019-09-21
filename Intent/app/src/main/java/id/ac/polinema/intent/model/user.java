package id.ac.polinema.intent.model;

import android.os.Parcel;
import android.os.Parcelable;

public class user implements Parcelable {
    private String username;
    private String name;
    private String age;

    public user(String username, String name, String age) {
        this.username = username;
        this.name = name;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.username);
        dest.writeString(this.name);
        dest.writeString(this.age);
    }

    protected user(Parcel in) {
        this.username = in.readString();
        this.name = in.readString();
        this.age = in.readString();
    }

    public static final Creator<user> CREATOR = new Creator<user>() {
        @Override
        public user createFromParcel(Parcel source) {
            return new user(source);
        }

        @Override
        public user[] newArray(int size) {
            return new user[size];
        }
    };
}
