SUMMARY = "Easy and Repeatable Kubernetes Development"
DESCRIPTION = "Skaffold is a command line tool that facilitates continuous development for Kubernetes applications. You can iterate on your application source code locally then deploy to local or remote Kubernetes clusters. Skaffold handles the workflow for building, pushing and deploying your application. It also provides building blocks and describe customizations for a CI/CD pipeline."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "skaffold-2.5.0-1.1.aarch64.rpm"
RPM_HASH = "ab9b82ce8b482cd0234ddc62d872d3376a111ce64d36a789345b29bb6dcdad774a5c317e6c92a2868bea264f8c96801fe30e536e8d69c416cf61306d11cff6ca"

RPROVIDES:${PN} += "skaffold \
skaffold(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
