SUMMARY = "Meta package for dependencies to build MRI"
DESCRIPTION = "Meta package for ruby-build dependencies to build MRI."
LICENSE = "MIT"

PV = "20230428"

RPM_NAME = "ruby-build-dependencies-mri-20230428-1.1.noarch.rpm"
RPM_HASH = "6f8b28be3f07fc6fe81478c46fd0a85aaed6a62dea0147118696b582bfa98c9a715416705f379c4c274a214af6f0eefa4f103e3ec5a49eb5b1dcbbb49c8a1f6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-mri"
RDEPENDS:${PN} += "automake bison gcc gdbm-devel gperf graphviz libffi-devel libjpeg-devel libyaml-devel openssl-devel readline-devel tk-devel"

inherit rpm
