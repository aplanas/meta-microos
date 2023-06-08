SUMMARY = "Kubernetes log viewer"
DESCRIPTION = "Kubernetes tail: streams logs from all containers of all matched pods. \
Match pods by service, replicaset, deployment, and others. Adjusts to a \
changing cluster - pods are added and removed from logging as they fall \
in or out of the selection."
LICENSE = "MIT"

PV = "0.16.1"

RPM_NAME = "kail-0.16.1-1.3.aarch64.rpm"
RPM_HASH = "6f2ef6883696e209348fcc12fe6dee5d4dac24d1784f5b1b3bc4d12b600da0a717cd09e8b4201032d822883c4eb9cdd3146411e6faa7dc35aba5c4332141d20b"

RPROVIDES:${PN} += "kail kail(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
