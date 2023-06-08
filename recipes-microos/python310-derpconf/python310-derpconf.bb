SUMMARY = "Configuration file loader"
DESCRIPTION = "derpconf abstracts loading configuration files for your app."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "python310-derpconf-0.8.3-1.16.noarch.rpm"
RPM_HASH = "b2472ade4f022f6c1140fa7f62c180086be4da64f2c1fd2b397cac162e8be104ec8bc5b995c4105c4b51ceb51423ffc076e5106ce90def558dadcaad42762bc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-derpconf python3.10dist(derpconf) python310-derpconf python3dist(derpconf)"
RDEPENDS:${PN} += "python(abi) python310-six"

inherit rpm
