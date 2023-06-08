SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "knewstuff-quick-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "5ab3d80e0d85bb9966f87534f1f39c4c8c9a1fca702da5be3be20a5904fc735237088362803986c140362084d21f70d673edf46e10782de184e47c98005a2aa0"

RPROVIDES:${PN} += "cmake(KF5NewStuffQuick) knewstuff-quick-devel knewstuff-quick-devel(aarch-64)"
RDEPENDS:${PN} += "extra-cmake-modules knewstuff-core-devel knewstuff-imports"

inherit rpm
