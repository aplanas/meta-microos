SUMMARY = "Version Lock Plugin for DNF"
DESCRIPTION = "Version lock plugin takes a set of name/versions for packages and excludes all other \
versions of those packages. This allows you to e.g. protect packages from being \
updated by newer versions."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "python3-dnf-plugin-versionlock-4.3.1-2.1.noarch.rpm"
RPM_HASH = "fb2cb4543446978bf5fae2aa9d3aad7bcac98772ab88ce09b8dbdbcb348e4887aef0c04e76937908cefe745c3e7303bffecdca85949425f2ecc2cbf39bd162fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(python3-dnf-plugin-versionlock) dnf-command(versionlock) dnf-plugin-versionlock dnf-plugins-extras-versionlock python3-dnf-plugin-versionlock python3-dnf-plugins-extras-versionlock yum-versionlock"
RDEPENDS:${PN} += "python(abi) python3-dnf-plugins-core"

inherit rpm
