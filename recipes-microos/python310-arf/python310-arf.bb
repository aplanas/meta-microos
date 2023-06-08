SUMMARY = "Advanced Recording Format for physiology and behavior"
DESCRIPTION = "The Advanced Recording Format ARF is an open standard for storing \
data from neuronal, acoustic, and behavioral experiments in a \
portable, high-performance, archival format. The goal is to enable \
labs to share data and tools, and to allow data to be accessed and \
analyzed for many years in the future. \
 \
ARF is built on the the HDF5 format, and all arf files are accessible \
through standard HDF5 tools, including interfaces to HDF5 written for \
other languages (e.g. MATLAB, Python, etc). ARF comprises a set of \
specifications on how different kinds of data are stored."
LICENSE = "GPL-2.0-only"

PV = "2.6.1"

RPM_NAME = "python310-arf-2.6.1-4.4.noarch.rpm"
RPM_HASH = "ecfe196462b5899aada41e6c402c613b191bf6cb5791ead58ae52ea93371e88f48d857aeb48bb245c7fdfcdd1693fd3f864d5e7f40db3c193bf206d839245404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arf python3.10dist(arf) python310-arf python3dist(arf)"
RDEPENDS:${PN} += "python(abi) python310-h5py"

inherit rpm
