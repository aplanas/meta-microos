SUMMARY = "Tool to speed up pandas calculations"
DESCRIPTION = "A package which efficiently applies any function to a \
pandas dataframe or series in the fastest available manner"
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python39-swifter-1.3.4-1.2.noarch.rpm"
RPM_HASH = "a8f68cfd0a5f797153a94c318781bb375f3e78673752889dadf1785edb58603fd0764a4526e64070dfa8524b8c5310971f8484e0d51fa47a9a27c9cf4ece3083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(swifter) python39-swifter python3dist(swifter)"
RDEPENDS:${PN} += "python(abi) python39-bleach python39-cloudpickle python39-dask-dataframe python39-ipywidgets python39-pandas python39-parso python39-psutil python39-tqdm"

inherit rpm
