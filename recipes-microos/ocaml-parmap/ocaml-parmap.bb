SUMMARY = "Multicore architecture exploitation for OCaml programs with minimal modifications"
DESCRIPTION = "If you want to use your many cores to accelerate an operation \
which happens to be a map, fold or map/fold (map-reduce), just use \
Parmap's parmap, parfold and parmapfold primitives in place of the \
standard List.map and friends; you can specify the number of \
subprocesses to use with the optional parameter ncores, and the \
size of granularity of the parallel computation with the optional \
parameter chunksize."
LICENSE = "LGPL-2.0-only"

PV = "1.2.5"

RPM_NAME = "ocaml-parmap-1.2.5-1.4.aarch64.rpm"
RPM_HASH = "86b511966d4ede3f60602c124f522b701596611b69682b662e584962bdc698448f2df6845a157b85ed12f50e75a6231a41331fedde16efe98d2affaab82b329b"

RPROVIDES:${PN} += "ocaml-parmap ocaml-parmap(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
