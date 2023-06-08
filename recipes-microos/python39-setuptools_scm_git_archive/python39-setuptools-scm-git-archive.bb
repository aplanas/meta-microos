SUMMARY = "Git archive plugin setuptools_scm"
DESCRIPTION = "This is a setuptools_scm plugin that adds support for git archives \
(for example the ones GitHub automatically generates). \
 \
Note that it only works for archives of tagged commits (because git currently \
lacks a format option equivalent to git describe --tags)."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python39-setuptools_scm_git_archive-1.1-2.1.noarch.rpm"
RPM_HASH = "c561daa1feb2b0373902c4024c62f4c8105fbdb919ca5bf8811df8dd985a869c988c14dbd5c3f5921e23747629d5493545eac2c5a926b048c26d3ac00808ad38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(setuptools-scm-git-archive) python39-setuptools_scm_git_archive python3dist(setuptools-scm-git-archive)"
RDEPENDS:${PN} += "python(abi) python39-setuptools_scm"

inherit rpm
