SUMMARY = "Python setuptools handler for SCM tags"
DESCRIPTION = "The setuptools_scm package handles managing one's Python package versions \
in SCM metadata. It also handles file finders for the supperted SCMs."
LICENSE = "MIT"

PV = "7.0.5"

RPM_NAME = "python39-setuptools_scm-7.0.5-2.1.noarch.rpm"
RPM_HASH = "aa1cbbf97077a62a1ee9f015c07649bf00c489d7478da39be31c01269f56d4343085b04cd071e7d5b58e6b8bc5b9cfe153effaeb480bf51227b4d925dc256358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(setuptools-scm) python39-setuptools_scm python3dist(setuptools-scm)"
RDEPENDS:${PN} += "python(abi) python39-packaging python39-setuptools python39-tomli python39-typing-extensions"

inherit rpm
