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

PV = "8.0.0"

RPM_NAME = "polaris-8.0.0-1.1.aarch64.rpm"
RPM_HASH = "c9ad37db7043a62b6b5c9d8d5cf9b049e4b2bb1b6e72a730294116d5ee1a6e0e967ca2a7605274df7f4bea820d5b179bceb5eaa58b51cd2fb7012c3e609fd658"

RPROVIDES:${PN} += "polaris \
polaris(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
