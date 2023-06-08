SUMMARY = "Audit your Kubernetes clusters against common security controls"
DESCRIPTION = "kubeaudit is a command line tool and a Go package to audit Kubernetes clusters for various different security concerns, such as: \
 \
- run as non-root \
- use a read-only root filesystem \
- drop scary capabilities, don't add new ones \
- don't run privileged \
- and more! \
 \
kubeaudit makes sure you deploy secure containers!"
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "kubeaudit-0.22.0-1.1.aarch64.rpm"
RPM_HASH = "71ed2ba4cafd468b7b84fd1b8603b48011083fc4d8652be9e4be10e784bd684ac4e9fff26869cc57db991b56abfe6903a068d5d09e0d8d7b26e4025f0e682546"

RPROVIDES:${PN} += "kubeaudit kubeaudit(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
