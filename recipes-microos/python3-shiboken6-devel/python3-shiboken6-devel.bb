SUMMARY = "Development files for python3-shiboken6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "python3-shiboken6-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "6c104e2c906e97d5797bc7488045b9076fb2521130657cf8a5433579ef8aede8df8b2b43714448b3814f8d41147594da26b95b990e14f007571533789935614b"

RPROVIDES:${PN} += "cmake(Shiboken6) cmake(Shiboken6Tools) pkgconfig(shiboken6) python3-shiboken6-devel python3-shiboken6-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config python3-shiboken6"

inherit rpm
