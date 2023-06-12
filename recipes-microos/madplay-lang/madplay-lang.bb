SUMMARY = "Translations for package madplay"
DESCRIPTION = "Provides translations for the 'madplay' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.15.2b"

RPM_NAME = "madplay-lang-0.15.2b-2.15.noarch.rpm"
RPM_HASH = "376ee61662ea3f7a8663ca41e547357d19a7baa6317d226db26ca4a26d09f3c0ec4775fd57c7261203e3d867e6f432e7b5a3ef70c6999c2a27148be3661f9de3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(madplay:en) \
locale(madplay:es) \
locale(madplay:fr) \
locale(madplay:hr) \
madplay-lang \
madplay-lang-all"
RDEPENDS:${PN} += "madplay"

inherit rpm
