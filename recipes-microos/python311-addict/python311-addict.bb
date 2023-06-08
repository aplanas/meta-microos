SUMMARY = "A dictionary using both attribute and item syntax"
DESCRIPTION = "Addict is a module that exposes a dictionary subclass that allows \
items to be set like attributes. Values are gettable and settable \
using both attribute and item syntax."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python311-addict-2.4.0-1.8.noarch.rpm"
RPM_HASH = "a427072407971c893254f6fc2689346cb23cd7a65dee1bd7b8f1bd29b1117fdba92aff63819cf6d20888b789b685edc5c5b17e82af7f01cdf9c7f5997febb347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(addict) python311-addict python3dist(addict)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
