SUMMARY = "A dictionary using both attribute and item syntax"
DESCRIPTION = "Addict is a module that exposes a dictionary subclass that allows \
items to be set like attributes. Values are gettable and settable \
using both attribute and item syntax."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python39-addict-2.4.0-1.8.noarch.rpm"
RPM_HASH = "e68d1b60e78b8a28b8df5454f5a75b7bfb1d3c223e23d320d5f3f9c50dee9374da933990f9b8c8581e5d449d462d6c1014f2dbc756c9fd640a37a80514e88590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(addict) python39-addict python3dist(addict)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
