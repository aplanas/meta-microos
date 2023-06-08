SUMMARY = "HPC Workload Manager"
DESCRIPTION = "This package provides all the relevant packages for running the central server \
component of the slurm workload manager."
LICENSE = "MIT"

PV = "20190218"

RPM_NAME = "patterns-hpc-workload_server-20190218-7.1.aarch64.rpm"
RPM_HASH = "6ace2c932054875930082cd108651b968da50c93396ef302fbfbd512bb1ae9de183cb843d38eaad64b824e421ae69ac836fed677ec1f317eddd01ee8412088a9"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-visible() patterns-hpc-workload_server patterns-hpc-workload_server(aarch-64)"
RDEPENDS:${PN} += "iputils slurm slurm-slurmdbd"

inherit rpm
