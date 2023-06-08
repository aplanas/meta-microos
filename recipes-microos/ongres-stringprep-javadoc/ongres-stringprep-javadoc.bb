SUMMARY = "Javadoc for ongres-stringprep"
DESCRIPTION = "This package contains javadoc for ongres-stringprep"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "ongres-stringprep-javadoc-1.1-1.10.noarch.rpm"
RPM_HASH = "2af3223068299fd1f1e7d0d02ed1ee0ba3f07fd2cca271d8ba0e4b9db818c1e1e902396c362d444bea29f9dcb46f9abf013d97ad87f950534e76af0aca162cba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ongres-stringprep-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
