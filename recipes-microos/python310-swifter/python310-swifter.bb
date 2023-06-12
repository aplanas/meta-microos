SUMMARY = "Tool to speed up pandas calculations"
DESCRIPTION = "A package which efficiently applies any function to a \
pandas dataframe or series in the fastest available manner"
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python310-swifter-1.3.4-1.2.noarch.rpm"
RPM_HASH = "792a663b34200e15a224b0df5616e8deb4386d3caadd0102c7089b45f425b4f916e9eb8edb71728b1063a35f1283c04c71112ced4b1614cc5c0ba09205c2862c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-swifter \
python3.10dist(swifter) \
python310-swifter \
python3dist(swifter)"
RDEPENDS:${PN} += "python(abi) \
python310-bleach \
python310-cloudpickle \
python310-dask-dataframe \
python310-ipywidgets \
python310-pandas \
python310-parso \
python310-psutil \
python310-tqdm"

inherit rpm
