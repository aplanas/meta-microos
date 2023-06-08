SUMMARY = "Easy and Repeatable Kubernetes Development"
DESCRIPTION = "Skaffold is a command line tool that facilitates continuous development for Kubernetes applications. You can iterate on your application source code locally then deploy to local or remote Kubernetes clusters. Skaffold handles the workflow for building, pushing and deploying your application. It also provides building blocks and describe customizations for a CI/CD pipeline."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "skaffold-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "05145e012517a365b71fe8c5df2fe84219ae2e285fe59de3ed721ae6c04e202984a18c7b5bea7d1a323290ea5183110b90b513122340699ecac327545f987d8a"

RPROVIDES:${PN} += "skaffold skaffold(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
