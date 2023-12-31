/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.ondevicepersonalization;

import android.annotation.NonNull;
import android.os.Parcelable;

import com.android.ondevicepersonalization.internal.util.AnnotationValidations;
import com.android.ondevicepersonalization.internal.util.DataClass;

/**
 * Location status for location histogram.
 *
 * @hide
 */
@DataClass(genBuilder = true, genEqualsHashCode = true)
public final class LocationStatus implements Parcelable {
    /** Location latitude with E4 precision. */
    @NonNull double mLatitude;

    /** Location longitude with E4 precision. */
    @NonNull double mLongitude;

    /** Duration in milliseconds for the location is visited in the past 30 days. */
    @NonNull long mDurationMillis;



    // Code below generated by codegen v1.0.23.
    //
    // DO NOT MODIFY!
    // CHECKSTYLE:OFF Generated code
    //
    // To regenerate run:
    // $ codegen $ANDROID_BUILD_TOP/packages/modules/OnDevicePersonalization/framework/java/android/ondevicepersonalization/LocationStatus.java
    //
    // To exclude the generated code from IntelliJ auto-formatting enable (one-time):
    //   Settings > Editor > Code Style > Formatter Control
    //@formatter:off


    @DataClass.Generated.Member
    /* package-private */ LocationStatus(
            @NonNull double latitude,
            @NonNull double longitude,
            @NonNull long durationMillis) {
        this.mLatitude = latitude;
        AnnotationValidations.validate(
                NonNull.class, null, mLatitude);
        this.mLongitude = longitude;
        AnnotationValidations.validate(
                NonNull.class, null, mLongitude);
        this.mDurationMillis = durationMillis;
        AnnotationValidations.validate(
                NonNull.class, null, mDurationMillis);

        // onConstructed(); // You can define this method to get a callback
    }

    /**
     * Location latitude with E4 precision.
     */
    @DataClass.Generated.Member
    public @NonNull double getLatitude() {
        return mLatitude;
    }

    /**
     * Location longitude with E4 precision.
     */
    @DataClass.Generated.Member
    public @NonNull double getLongitude() {
        return mLongitude;
    }

    /**
     * Duration in milliseconds for the location is visited in the past 30 days.
     */
    @DataClass.Generated.Member
    public @NonNull long getDurationMillis() {
        return mDurationMillis;
    }

    @Override
    @DataClass.Generated.Member
    public boolean equals(@android.annotation.Nullable Object o) {
        // You can override field equality logic by defining either of the methods like:
        // boolean fieldNameEquals(LocationStatus other) { ... }
        // boolean fieldNameEquals(FieldType otherValue) { ... }

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        @SuppressWarnings("unchecked")
        LocationStatus that = (LocationStatus) o;
        //noinspection PointlessBooleanExpression
        return true
                && mLatitude == that.mLatitude
                && mLongitude == that.mLongitude
                && mDurationMillis == that.mDurationMillis;
    }

    @Override
    @DataClass.Generated.Member
    public int hashCode() {
        // You can override field hashCode logic by defining methods like:
        // int fieldNameHashCode() { ... }

        int _hash = 1;
        _hash = 31 * _hash + Double.hashCode(mLatitude);
        _hash = 31 * _hash + Double.hashCode(mLongitude);
        _hash = 31 * _hash + Long.hashCode(mDurationMillis);
        return _hash;
    }

    @Override
    @DataClass.Generated.Member
    public void writeToParcel(@NonNull android.os.Parcel dest, int flags) {
        // You can override field parcelling by defining methods like:
        // void parcelFieldName(Parcel dest, int flags) { ... }

        dest.writeDouble(mLatitude);
        dest.writeDouble(mLongitude);
        dest.writeLong(mDurationMillis);
    }

    @Override
    @DataClass.Generated.Member
    public int describeContents() { return 0; }

    /** @hide */
    @SuppressWarnings({"unchecked", "RedundantCast"})
    @DataClass.Generated.Member
    /* package-private */ LocationStatus(@NonNull android.os.Parcel in) {
        // You can override field unparcelling by defining methods like:
        // static FieldType unparcelFieldName(Parcel in) { ... }

        double latitude = in.readDouble();
        double longitude = in.readDouble();
        long durationMillis = in.readLong();

        this.mLatitude = latitude;
        AnnotationValidations.validate(
                NonNull.class, null, mLatitude);
        this.mLongitude = longitude;
        AnnotationValidations.validate(
                NonNull.class, null, mLongitude);
        this.mDurationMillis = durationMillis;
        AnnotationValidations.validate(
                NonNull.class, null, mDurationMillis);

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    public static final @NonNull Parcelable.Creator<LocationStatus> CREATOR
            = new Parcelable.Creator<LocationStatus>() {
        @Override
        public LocationStatus[] newArray(int size) {
            return new LocationStatus[size];
        }

        @Override
        public LocationStatus createFromParcel(@NonNull android.os.Parcel in) {
            return new LocationStatus(in);
        }
    };

    /**
     * A builder for {@link LocationStatus}
     */
    @SuppressWarnings("WeakerAccess")
    @DataClass.Generated.Member
    public static final class Builder {

        private @NonNull double mLatitude;
        private @NonNull double mLongitude;
        private @NonNull long mDurationMillis;

        private long mBuilderFieldsSet = 0L;

        /**
         * Creates a new Builder.
         *
         * @param latitude
         *   Location latitude with E4 precision.
         * @param longitude
         *   Location longitude with E4 precision.
         * @param durationMillis
         *   Duration in milliseconds for the location is visited in the past 30 days.
         */
        public Builder(
                @NonNull double latitude,
                @NonNull double longitude,
                @NonNull long durationMillis) {
            mLatitude = latitude;
            AnnotationValidations.validate(
                    NonNull.class, null, mLatitude);
            mLongitude = longitude;
            AnnotationValidations.validate(
                    NonNull.class, null, mLongitude);
            mDurationMillis = durationMillis;
            AnnotationValidations.validate(
                    NonNull.class, null, mDurationMillis);
        }

        public Builder() {
        }

        /**
         * Location latitude with E4 precision.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setLatitude(@NonNull double value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x1;
            mLatitude = value;
            return this;
        }

        /**
         * Location longitude with E4 precision.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setLongitude(@NonNull double value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x2;
            mLongitude = value;
            return this;
        }

        /**
         * Duration in milliseconds for the location is visited in the past 30 days.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setDurationMillis(@NonNull long value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x4;
            mDurationMillis = value;
            return this;
        }

        /** Builds the instance. This builder should not be touched after calling this! */
        public @NonNull LocationStatus build() {
            checkNotUsed();
            mBuilderFieldsSet |= 0x8; // Mark builder used

            LocationStatus o = new LocationStatus(
                    mLatitude,
                    mLongitude,
                    mDurationMillis);
            return o;
        }

        private void checkNotUsed() {
            if ((mBuilderFieldsSet & 0x8) != 0) {
                throw new IllegalStateException(
                        "This Builder should not be reused. Use a new Builder instance instead");
            }
        }
    }

    @DataClass.Generated(
            time = 1676500042544L,
            codegenVersion = "1.0.23",
            sourceFile = "packages/modules/OnDevicePersonalization/framework/java/android/ondevicepersonalization/LocationStatus.java",
            inputSignatures = " @android.annotation.NonNull double mLatitude\n @android.annotation.NonNull double mLongitude\n @android.annotation.NonNull long mDurationMillis\nclass LocationStatus extends java.lang.Object implements [android.os.Parcelable]\n@com.android.ondevicepersonalization.internal.util.DataClass(genBuilder=true, genEqualsHashCode=true)")
    @Deprecated
    private void __metadata() {}


    //@formatter:on
    // End of generated code

}
