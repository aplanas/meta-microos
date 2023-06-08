SUMMARY = "Distributed computing using remote objects"
DESCRIPTION = "Distob will take your existing python objects, or a sequence of \
objects, and scatter them onto many IPython parallel engines, which \
may be running on a single computer or on a cluster. \
 \
In place of the original objects, proxy objects are kept on the client \
computer that provide the same interface as the original objects. You \
can continue to use these as if the objects were still local. All \
methods are passed through to the remote objects, where computation is \
done. \
 \
In particular, sending numpy arrays to the cluster is supported. \
 \
A numpy array can also be scattered across the cluster, along a \
particular axis. Operations on the array can then be automatically \
done in parallel."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.3"

RPM_NAME = "python311-distob-0.3.3-3.7.noarch.rpm"
RPM_HASH = "85a709e1ff7adfbdd9597bc903cfa39c0d7b2ee09c05c9a10e25d91d322ebfaae8ea53148cfb5946bbdac6870bebd0eaa719a7e186a93401dd005687cadffc13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(distob) python311-distob python3dist(distob)"
RDEPENDS:${PN} += "python(abi) python311-dill python311-ipyparallel python311-pyzmq"

inherit rpm
