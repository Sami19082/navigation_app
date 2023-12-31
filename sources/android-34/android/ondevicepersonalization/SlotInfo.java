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

import android.os.Parcelable;

import com.android.ondevicepersonalization.internal.util.DataClass;

/**
 * Properties of a slot where a calling app wants to render personalized content.
 *
 * @hide
 */
@DataClass(genBuilder = true, genEqualsHashCode = true)
public final class SlotInfo implements Parcelable {
    /** The width of the slot. */
    private int mWidth = 0;

    /** The height of the slot. */
    private int mHeight = 0;



    // Code below generated by codegen v1.0.23.
    //
    // DO NOT MODIFY!
    // CHECKSTYLE:OFF Generated code
    //
    // To regenerate run:
    // $ codegen $ANDROID_BUILD_TOP/packages/modules/OnDevicePersonalization/framework/java/android/ondevicepersonalization/SlotInfo.java
    //
    // To exclude the generated code from IntelliJ auto-formatting enable (one-time):
    //   Settings > Editor > Code Style > Formatter Control
    //@formatter:off


    @DataClass.Generated.Member
    /* package-private */ SlotInfo(
            int width,
            int height) {
        this.mWidth = width;
        this.mHeight = height;

        // onConstructed(); // You can define this method to get a callback
    }

    /**
     * The width of the slot.
     */
    @DataClass.Generated.Member
    public int getWidth() {
        return mWidth;
    }

    /**
     * The height of the slot.
     */
    @DataClass.Generated.Member
    public int getHeight() {
        return mHeight;
    }

    @Override
    @DataClass.Generated.Member
    public boolean equals(@android.annotation.Nullable Object o) {
        // You can override field equality logic by defining either of the methods like:
        // boolean fieldNameEquals(SlotInfo other) { ... }
        // boolean fieldNameEquals(FieldType otherValue) { ... }

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        @SuppressWarnings("unchecked")
        SlotInfo that = (SlotInfo) o;
        //noinspection PointlessBooleanExpression
        return true
                && mWidth == that.mWidth
                && mHeight == that.mHeight;
    }

    @Override
    @DataClass.Generated.Member
    public int hashCode() {
        // You can override field hashCode logic by defining methods like:
        // int fieldNameHashCode() { ... }

        int _hash = 1;
        _hash = 31 * _hash + mWidth;
        _hash = 31 * _hash + mHeight;
        return _hash;
    }

    @Override
    @DataClass.Generated.Member
    public void writeToParcel(@android.annotation.NonNull android.os.Parcel dest, int flags) {
        // You can override field parcelling by defining methods like:
        // void parcelFieldName(Parcel dest, int flags) { ... }

        dest.writeInt(mWidth);
        dest.writeInt(mHeight);
    }

    @Override
    @DataClass.Generated.Member
    public int describeContents() { return 0; }

    /** @hide */
    @SuppressWarnings({"unchecked", "RedundantCast"})
    @DataClass.Generated.Member
    /* package-private */ SlotInfo(@android.annotation.NonNull android.os.Parcel in) {
        // You can override field unparcelling by defining methods like:
        // static FieldType unparcelFieldName(Parcel in) { ... }

        int width = in.readInt();
        int height = in.readInt();

        this.mWidth = width;
        this.mHeight = height;

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    public static final @android.annotation.NonNull Parcelable.Creator<SlotInfo> CREATOR
            = new Parcelable.Creator<SlotInfo>() {
        @Override
        public SlotInfo[] newArray(int size) {
            return new SlotInfo[size];
        }

        @Override
        public SlotInfo createFromParcel(@android.annotation.NonNull android.os.Parcel in) {
            return new SlotInfo(in);
        }
    };

    /**
     * A builder for {@link SlotInfo}
     */
    @SuppressWarnings("WeakerAccess")
    @DataClass.Generated.Member
    public static final class Builder {

        private int mWidth;
        private int mHeight;

        private long mBuilderFieldsSet = 0L;

        public Builder() {
        }

        /**
         * The width of the slot.
         */
        @DataClass.Generated.Member
        public @android.annotation.NonNull Builder setWidth(int value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x1;
            mWidth = value;
            return this;
        }

        /**
         * The height of the slot.
         */
        @DataClass.Generated.Member
        public @android.annotation.NonNull Builder setHeight(int value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x2;
            mHeight = value;
            return this;
        }

        /** Builds the instance. This builder should not be touched after calling this! */
        public @android.annotation.NonNull SlotInfo build() {
            checkNotUsed();
            mBuilderFieldsSet |= 0x4; // Mark builder used

            if ((mBuilderFieldsSet & 0x1) == 0) {
                mWidth = 0;
            }
            if ((mBuilderFieldsSet & 0x2) == 0) {
                mHeight = 0;
            }
            SlotInfo o = new SlotInfo(
                    mWidth,
                    mHeight);
            return o;
        }

        private void checkNotUsed() {
            if ((mBuilderFieldsSet & 0x4) != 0) {
                throw new IllegalStateException(
                        "This Builder should not be reused. Use a new Builder instance instead");
            }
        }
    }

    @DataClass.Generated(
            time = 1671568316607L,
            codegenVersion = "1.0.23",
            sourceFile = "packages/modules/OnDevicePersonalization/framework/java/android/ondevicepersonalization/SlotInfo.java",
            inputSignatures = "private  int mWidth\nprivate  int mHeight\nclass SlotInfo extends java.lang.Object implements [android.os.Parcelable]\n@com.android.ondevicepersonalization.internal.util.DataClass(genBuilder=true, genEqualsHashCode=true)")
    @Deprecated
    private void __metadata() {}


    //@formatter:on
    // End of generated code

}
