SUMMARY = "Microsoft Azure namespace package"
DESCRIPTION = "This is the Microsoft Azure namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure namespace."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python310-azure-nspkg-3.0.2-3.9.noarch.rpm"
RPM_HASH = "35d4bf3424c43d278d79595c06146614b48024650ce465d681c53dcc48d43eaa1da632364233e36f3b3776c7be497423532232f4be4dafc997f7e02744b47f2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-nspkg python3.10dist(azure-nspkg) python310-azure-nspkg python3dist(azure-nspkg)"
RDEPENDS:${PN} += ""

inherit rpm
