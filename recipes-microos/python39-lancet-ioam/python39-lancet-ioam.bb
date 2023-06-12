SUMMARY = "Launch jobs, organize the output, and dissect the results"
DESCRIPTION = "Lancet is designed to help you organize the output of your research \
tools, store it, and dissect the data you have collected. The output \
of a single simulation or analysis rarely contains all the data you \
need; Lancet helps you generate data from many runs and analyse it \
using your own Python code. \
 \
Parameter spaces often need to be explored for the purpose of \
plotting, tuning, or analysis. Lancet helps you extract the \
information you care about from potentially enormous volumes of data \
generated by such parameter exploration."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python39-lancet-ioam-0.9.0-2.22.noarch.rpm"
RPM_HASH = "163f1159b50b2435bfc3564d5705c8a2d1e6d44f4070631da3461ed10f40ba9bb932b3b8d51703e9bf7ec7ebcb9f2068e028f4f6d79e8a1c3e8ce00399a291c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(lancet-ioam) \
python39-lancet-ioam \
python3dist(lancet-ioam)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
