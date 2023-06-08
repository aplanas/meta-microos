SUMMARY = "The PipeWire SPA Tools"
DESCRIPTION = "SPA or Simple Plugin API is a plugin API. \
 \
This package provides spa-inspect and spa-monitor tools."
LICENSE = "MIT"

PV = "0.3.69"

RPM_NAME = "pipewire-spa-tools-0.3.69-2.1.aarch64.rpm"
RPM_HASH = "da90cddf0cd994b33867fd5e9dbd0541b3e6620374307c07a487e369df1ab2379b2b7a80a77adeaf21d46dd4075b9e2d58341b3bab4d1887854b13866470a19d"

RPROVIDES:${PN} += "pipewire-spa-tools pipewire-spa-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit)"

inherit rpm
