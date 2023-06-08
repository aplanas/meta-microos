SUMMARY = "Documentation for Vagrant"
DESCRIPTION = "This package contains the documentation for vagrant."
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "vagrant-doc-2.3.4-4.1.noarch.rpm"
RPM_HASH = "91c1e85ef78387c15b98284b0fa71de7552d2875c61aae31982ffa245c94ec7d3b7041219c98a3403697c5e291aaa1b26e8aac6abc09195c350a1ec7ecf1aeca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vagrant-doc"
RDEPENDS:${PN} += ""

inherit rpm
