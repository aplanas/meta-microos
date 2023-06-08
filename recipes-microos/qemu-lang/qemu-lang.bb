SUMMARY = "Translations for QEMU"
DESCRIPTION = "This package contains a few language translations, particularly for the \
graphical user interface components that come with QEMU. The bulk of strings \
in QEMU are not localized."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-lang-7.1.0-16.1.aarch64.rpm"
RPM_HASH = "3d4ddffdcdf4888ce6d9528422f339fffebd497d4bef1d59493787c1c74be0edd38b7bfcbd2b6e70e746d532d317e87aeef7191bb2a6710f37b55887733cf7ad"

RPROVIDES:${PN} += "locale(qemu:bg) locale(qemu:de_DE) locale(qemu:fr_FR) locale(qemu:hu) locale(qemu:it) locale(qemu:sv) locale(qemu:tr) locale(qemu:uk) locale(qemu:zh_CN) qemu-lang qemu-lang(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
