SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "knewstuff-core-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "332a9fb698a34b1e5b630268e8116dbd7cd0bb29a51990537083bc0417f1480670e9e1bd58e579fd48d90310df9c57094907f0d0d8502617943b357f36fb04d0"

RPROVIDES:${PN} += "cmake(KF5NewStuffCore) knewstuff-core-devel knewstuff-core-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Attica) extra-cmake-modules libKF5NewStuffCore5"

inherit rpm
