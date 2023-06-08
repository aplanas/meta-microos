SUMMARY = "GClient library for fcitx5"
DESCRIPTION = "This package provides GClient library for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.22"

RPM_NAME = "libFcitx5GClient2-5.0.22-1.3.aarch64.rpm"
RPM_HASH = "525557822f73b300f8bbb11c7526764b0c5296bbe05a7045fa0be9db5f77bcbe9dc32a9917ad7a59b84f762ae9e206bf35e7ee9f1ec90bc70c30cde391e225aa"

RPROVIDES:${PN} += "libFcitx5GClient.so.2()(64bit) libFcitx5GClient2 libFcitx5GClient2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
