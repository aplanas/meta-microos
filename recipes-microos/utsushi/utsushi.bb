SUMMARY = "Next Generation Image Acquisition Utilities"
DESCRIPTION = "This software provides applications to easily turn hard-copy documents and \
imagery into formats that are more amenable to computer processing. \
 \
Included are a native driver for a number of EPSON scanners and a compatibility \
driver to interface with software built around the SANE standard. \
 \
This is the community maintained fork, based on imagescan upstream."
LICENSE = "GPL-3.0-or-later"

PV = "1638580181.839d06a"

RPM_NAME = "utsushi-1638580181.839d06a-2.9.aarch64.rpm"
RPM_HASH = "026e763432404bd5d2183cc3367cf1e751b46ea7ef42f2b95b334d999e8b4a50ce756725798044dd3532af674bae664d001f508c81fd38742ac9d17108a0f987"

RPROVIDES:${PN} += "config(utsushi) imagescan libcnx-hexdump.so()(64bit) libcnx-usb.so()(64bit) libdrv-combo.so()(64bit) libdrv-esci.so()(64bit) libflt-all.so()(64bit) libsane.so.1()(64bit) libutsushi-gtkmm.so()(64bit) libutsushi.so()(64bit) utsushi utsushi(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libMagick++-7.Q16HDRI.so.5()(64bit) libatkmm-1.6.so.1()(64bit) libboost_filesystem.so.1.82.0()(64bit) libboost_program_options.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdkmm-2.4.so.1()(64bit) libglib-2.0.so.0()(64bit) libglibmm-2.4.so.1()(64bit) libgobject-2.0.so.0()(64bit) libgtkmm-2.4.so.1()(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libltdl.so.7()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpangomm-1.4.so.1()(64bit) libsigc-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
