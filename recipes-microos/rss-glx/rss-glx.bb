SUMMARY = "Really Slick Screensavers Port to GLX"
DESCRIPTION = "Cool collection of 3D screensavers. Linux port of Really Slick Screensavers"
LICENSE = "GPL-2.0-only & GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "rss-glx-0.9.1-23.10.aarch64.rpm"
RPM_HASH = "c0e9d6316990816d2f8cb0e6099b9dd8125febb3799d648a3c5bf6db3f6d19b3687a96ea3f2099d87d0524a6c406c24ae4efa3ebe5d216242a1dda44915b946b"

RPROVIDES:${PN} += "config(rss-glx) libImplicit.so.0()(64bit) libPixelCity.so.0()(64bit) librsMath.so.0()(64bit) rss-glx rss-glx(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libGLU.so.1()(64bit) libMagickCore-7.Q16HDRI.so.10()(64bit) libMagickWand-7.Q16HDRI.so.10()(64bit) libMagickWand-7.Q16HDRI.so.10(VERS_10.0)(64bit) libX11.so.6()(64bit) libalut.so.0()(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenal.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
