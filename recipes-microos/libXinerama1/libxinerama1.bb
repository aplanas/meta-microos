SUMMARY = "Xinerama extension to the X11 Protocol"
DESCRIPTION = "Xinerama is an extension to the X Window System which enables \
multi-headed X applications and window managers to use two or more \
physical displays as one large virtual display."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "libXinerama1-1.1.5-1.2.aarch64.rpm"
RPM_HASH = "f9d6d68c69e5b66357f54821fa106b3e59a8b5e3c83dd09d7853a9b848d30e398b48d5db8592aa74c3f2556e5b96793a2f4b1e4d1a858732bade5ad2fd1db78d"

RPROVIDES:${PN} += "libXinerama.so.1()(64bit) libXinerama1 libXinerama1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
