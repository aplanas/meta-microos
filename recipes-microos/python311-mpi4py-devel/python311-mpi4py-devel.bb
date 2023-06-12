SUMMARY = "Development files for python311-mpi4py"
DESCRIPTION = "Development libraries and headers needed to build packages using python311-mpi4py."
LICENSE = "BSD-2-Clause"

PV = "3.1.4"

RPM_NAME = "python311-mpi4py-devel-3.1.4-2.5.aarch64.rpm"
RPM_HASH = "85592de01a82fc7ef49d6e1da7096b915016171531c52bb3dc78c7ed47d916847f4d32605d188a15a7bab04ae92509f8fa7d9420e0bab7fa2d0eb835d4bd2464"

RPROVIDES:${PN} += "python311-mpi4py-devel \
python311-mpi4py-devel(aarch-64)"
RDEPENDS:${PN} += "python311-devel \
python311-mpi4py \
python311-mpi4py-common-devel"

inherit rpm
