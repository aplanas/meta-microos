SUMMARY = "Non-ABI stable API for the Qt 6 NetworkAuth Library"
DESCRIPTION = "This package provides private headers of libQt6NetworkAuth that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-networkauth-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "c8abfb7a28eba46872415822e180315c2b427f586ab3b65e62e78ac4fd525d7cf54a6bf827af70c938a9900309b127e9c3cde605b4d72047e2b5d46011788ae1"

RPROVIDES:${PN} += "qt6-networkauth-private-devel qt6-networkauth-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6NetworkAuth)"

inherit rpm
