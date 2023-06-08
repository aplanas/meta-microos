SUMMARY = "Validation of best practices in your Kubernetes clusters"
DESCRIPTION = "Best Practices for Kubernetes Workload Configuration \
 \
Fairwinds' Polaris keeps your clusters sailing smoothly. It runs a variety of checks to ensure that Kubernetes pods and controllers are configured using best practices, helping you avoid problems in the future. \
 \
Polaris can be run in three different modes: \
* As a dashboard, so you can audit what's running inside your cluster. \
* As an admission controller, so you can automatically reject workloads that don't adhere to your organization's policies. \
* As a command-line tool, so you can test local YAML files, e.g. as part of a CI/CD process."
LICENSE = "Apache-2.0"

PV = "7.4.1"

RPM_NAME = "polaris-7.4.1-1.1.aarch64.rpm"
RPM_HASH = "dc93cfe1281c2cb351f5b5d71664c753f0cd6c68ed9ffbc10155a4def74aec19dc26c2a7ab156ddf8b11c388d06b7560756a0e7b6f9b5940c8fa6989379ddeaf"

RPROVIDES:${PN} += "polaris polaris(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
