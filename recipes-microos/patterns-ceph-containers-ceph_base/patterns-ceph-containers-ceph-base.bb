SUMMARY = "Ceph base"
DESCRIPTION = "This provides the base for the Ceph, Rook, Ceph CSI driver packages and containers."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "patterns-ceph-containers-ceph_base-1.0-5.2.aarch64.rpm"
RPM_HASH = "4c356d89444909cf08fa7468a56860fdc0be17e2949cedb6d67c9146b0aa587a8e1d78c1377f45be223857a4db78645c8107d7ef0471fa6513d595fd2b99cc91"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-ceph-containers-ceph_base \
patterns-ceph-containers-ceph_base(aarch-64)"
RDEPENDS:${PN} += "ca-certificates \
ceph \
ceph-base \
ceph-common \
ceph-fuse \
ceph-grafana-dashboards \
ceph-iscsi \
ceph-mds \
ceph-mgr \
ceph-mgr-cephadm \
ceph-mgr-dashboard \
ceph-mgr-diskprediction-local \
ceph-mgr-rook \
ceph-mon \
ceph-osd \
ceph-prometheus-alerts \
ceph-radosgw \
cephadm \
e2fsprogs \
gptfdisk \
kmod \
lvm2 \
rbd-mirror \
rbd-nbd \
tcmu-runner-handler-rbd"

inherit rpm
