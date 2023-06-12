SUMMARY = "Languages for package libstorage-ng"
DESCRIPTION = "Provides translations to the package libstorage-ng"
LICENSE = "GPL-2.0-only"

PV = "4.5.115"

RPM_NAME = "libstorage-ng-lang-4.5.115-1.1.noarch.rpm"
RPM_HASH = "6736b55fb436f093914fce5fce27bf27b16c55eafa3fdd1ec5b1978e0df4e4bfe3e313d8f1c318f95b63ea886cf12b055527a020abb96849d70cfd46d123f9eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libstorage-ng-lang \
libstorage-ng-lang-all \
locale(libstorage-ng:af) \
locale(libstorage-ng:ar) \
locale(libstorage-ng:be) \
locale(libstorage-ng:bg) \
locale(libstorage-ng:bn) \
locale(libstorage-ng:bs) \
locale(libstorage-ng:ca) \
locale(libstorage-ng:cs) \
locale(libstorage-ng:cy) \
locale(libstorage-ng:da) \
locale(libstorage-ng:de) \
locale(libstorage-ng:el) \
locale(libstorage-ng:en_GB) \
locale(libstorage-ng:en_US) \
locale(libstorage-ng:eo) \
locale(libstorage-ng:es) \
locale(libstorage-ng:et) \
locale(libstorage-ng:eu) \
locale(libstorage-ng:fa) \
locale(libstorage-ng:fi) \
locale(libstorage-ng:fr) \
locale(libstorage-ng:gl) \
locale(libstorage-ng:gu) \
locale(libstorage-ng:he) \
locale(libstorage-ng:hi) \
locale(libstorage-ng:hr) \
locale(libstorage-ng:hu) \
locale(libstorage-ng:id) \
locale(libstorage-ng:it) \
locale(libstorage-ng:ja) \
locale(libstorage-ng:ka) \
locale(libstorage-ng:km) \
locale(libstorage-ng:ko) \
locale(libstorage-ng:lt) \
locale(libstorage-ng:mk) \
locale(libstorage-ng:mr) \
locale(libstorage-ng:nb) \
locale(libstorage-ng:nds) \
locale(libstorage-ng:nl) \
locale(libstorage-ng:nn) \
locale(libstorage-ng:pa) \
locale(libstorage-ng:pl) \
locale(libstorage-ng:pt) \
locale(libstorage-ng:pt_BR) \
locale(libstorage-ng:ro) \
locale(libstorage-ng:ru) \
locale(libstorage-ng:si) \
locale(libstorage-ng:sk) \
locale(libstorage-ng:sl) \
locale(libstorage-ng:sr) \
locale(libstorage-ng:sv) \
locale(libstorage-ng:ta) \
locale(libstorage-ng:th) \
locale(libstorage-ng:tr) \
locale(libstorage-ng:uk) \
locale(libstorage-ng:vi) \
locale(libstorage-ng:wa) \
locale(libstorage-ng:zh_CN) \
locale(libstorage-ng:zh_TW)"
RDEPENDS:${PN} += ""

inherit rpm
