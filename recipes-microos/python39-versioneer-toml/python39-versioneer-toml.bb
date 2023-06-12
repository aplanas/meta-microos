SUMMARY = "VCS-based management of project version strings [toml] extra"
DESCRIPTION = "Versioneer is a tool to automatically update version strings (in \
setup.py and the conventional ‘from PROJECT import _version’ pattern) \
by asking the version control system about the current tree. \
 \
This package provides the [toml] extra"
LICENSE = "Unlicense"

PV = "0.28"

RPM_NAME = "python39-versioneer-toml-0.28-1.1.noarch.rpm"
RPM_HASH = "9730a471800479bbe666a31cf6096fe2cfa686eb37f54f8fdf7692515c2da55f950089d68a461cc98233258b6b8b7188753dee1bdb1f1b1f28e1ab6e7c48a21f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-versioneer-toml"
RDEPENDS:${PN} += "(python39-tomli if python39-base < 3.11) python39-versioneer"

inherit rpm
