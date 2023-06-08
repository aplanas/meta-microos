SUMMARY = "Documentation for GLM library"
DESCRIPTION = "This package provides the documentation for GLM library."
LICENSE = "GPL-2.0-only & MIT"

PV = "0.9.9.8"

RPM_NAME = "glm-doc-0.9.9.8-2.7.noarch.rpm"
RPM_HASH = "447f95963613b9d8c4bd3ab9eba4e75a061de513d5dba440e8c9fb948fcf95a85c491a4f8649d0d0c0a3af9df26b4e99ac25d277a08f64970cd64b0fddb78158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glm-doc"
RDEPENDS:${PN} += ""

inherit rpm
