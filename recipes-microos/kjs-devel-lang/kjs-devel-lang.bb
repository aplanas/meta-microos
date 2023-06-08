SUMMARY = "Translations for package kjs-devel"
DESCRIPTION = "Provides translations for the 'kjs-devel' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kjs-devel-lang-5.105.0-1.1.noarch.rpm"
RPM_HASH = "7ee8ea94351415352eabd8162883b32126411680ad1d74654403694913f8c24955e90bfec6845f15a8269c6b1ca9a6b9df1bf48e4c5a29d6a10ebf2d7725d73f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kjs-devel-lang kjs-devel-lang-all"
RDEPENDS:${PN} += "kjs-devel"

inherit rpm
