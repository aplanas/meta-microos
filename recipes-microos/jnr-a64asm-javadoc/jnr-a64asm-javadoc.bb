SUMMARY = "Javadocs for jnr-a64asm"
DESCRIPTION = "This package contains the API documentation for jnr-a64asm."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "jnr-a64asm-javadoc-1.0.0-1.13.noarch.rpm"
RPM_HASH = "29c7853fd9e4e812a693ae7c8a4f8e9cd54e1d218c77eaa3374f76cfd738506449340226e880cb6fa953936ff6e187365ba2a0c4efcf9af83d099295a14ae82c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-a64asm-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
