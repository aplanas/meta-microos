SUMMARY = "A fcitx plugin for mlterm"
DESCRIPTION = "A plugin to use the fcitx input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.2"

RPM_NAME = "mlterm-fcitx-3.9.2-3.3.aarch64.rpm"
RPM_HASH = "186b07a4e4d9a917df662052a38c91b0e8c21323a0dd6bd05dd7599c645eb68056940e1da3388e6f38a112cadd9112d323f12a6e32d6db9f2146127709282eeb"

RPROVIDES:${PN} += "libim-fcitx-sdl2.so()(64bit) \
libim-fcitx-wl.so()(64bit) \
libim-fcitx.so()(64bit) \
locale(fcitx:ja;ko;ar;he) \
mlterm-fcitx \
mlterm-fcitx(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFcitx5GClient.so.2()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpobl.so.2()(64bit)"

inherit rpm
