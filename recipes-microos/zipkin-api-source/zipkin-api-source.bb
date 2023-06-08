SUMMARY = "Source code of zipkin-api"
DESCRIPTION = "This package contains source code of zipkin-api"
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "zipkin-api-source-0.2.2-1.9.noarch.rpm"
RPM_HASH = "97e57d4948e5bee26145e715f60fba4ab81cee4e26ca2d0735ebe98cfa8129fbd02e3aff4b3caa75de93ef7d013728728e56b35bc9b768c20550f9c1fd862d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zipkin-api-source"
RDEPENDS:${PN} += "/bin/bash /bin/sh"

inherit rpm
