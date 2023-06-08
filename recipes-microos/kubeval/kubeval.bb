SUMMARY = "Validate your Kubernetes configuration files"
DESCRIPTION = "kubeval is a tool for validating a Kubernetes YAML or JSON configuration file. It does so using schemas generated from the Kubernetes OpenAPI specification, and therefore can validate schemas for multiple versions of Kubernetes."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "kubeval-0.16.1-1.8.aarch64.rpm"
RPM_HASH = "6a5956972bf98f6b5c80cb93700bf45792eaa5aba8cfbf5d4218881ab89d2224be74ea571e678db5bd73cf9d5feadef488489f7da4bc691a3fd9427ee215b870"

RPROVIDES:${PN} += "kubeval kubeval(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
