SUMMARY = "Add inline tabbed content to your Sphinx documentation"
DESCRIPTION = "Add inline tabbed content to your Sphinx documentation."
LICENSE = "MIT"

PV = "2023.4.21"

RPM_NAME = "python311-sphinx-inline-tabs-2023.4.21-1.1.noarch.rpm"
RPM_HASH = "6259f44d464bdd2c7afe7febee23d83a76f60ce1611078008b626bcb81a333edaea3c06b5db7954dfb987868fd8221dd8194299e758a519614f0f6ad93082b8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinx-inline-tabs) python311-sphinx-inline-tabs python3dist(sphinx-inline-tabs)"
RDEPENDS:${PN} += "python(abi) python311-Sphinx"

inherit rpm
