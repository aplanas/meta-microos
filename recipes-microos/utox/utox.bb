SUMMARY = "The lightweight Tox client"
DESCRIPTION = "Lightweight Tox client."
LICENSE = "MIT"

PV = "0.18.1"

RPM_NAME = "utox-0.18.1-1.14.aarch64.rpm"
RPM_HASH = "16a9f65fd5724f67525cbbf5a5d591fc6b55eb0ffe9fc42a35c7609ecd9feaf8a5d9e94730acc75c78c7efbec55c359288caaf78f23b36728eb8f69f12eead85"

RPROVIDES:${PN} += "application() application(utox.desktop) mimehandler(x-scheme-handler/tox) utox utox(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXrender.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libfilteraudio.so.0()(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenal.so.1()(64bit) libtoxcore.so.2()(64bit) libv4lconvert.so.0()(64bit) libvpx.so.8()(64bit)"

inherit rpm
