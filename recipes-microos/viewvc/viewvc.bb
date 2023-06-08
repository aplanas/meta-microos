SUMMARY = "Browse a Subversion Repository with a Web Browser"
DESCRIPTION = "ViewVC is a browser interface for CVS and Subversion version control \
repositories. It generates templatized HTML to present navigable \
directory, revision, and change log listings. It can display specific \
versions of files as well as diffs between those versions. Basically, \
ViewVC provides the bulk of the report-like functionality you expect \
out of your version control tool, but much prettier than the average \
textual command-line program output. \
 \
ViewVC is the successor of ViewCVS."
LICENSE = "BSD-2-Clause"

PV = "1.3.0~dev20230104"

RPM_NAME = "viewvc-1.3.0~dev20230104-1.1.noarch.rpm"
RPM_HASH = "26c3a100b9732bec93ea8298d9fc685fb814329a974fc235cebed01e21334bd762037464ad68900e7c0e42b84d5a6692d45dd6a5486997c3f14f2590211fdd01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(viewvc) subversion-viewcvs viewcvs viewvc"
RDEPENDS:${PN} += "/usr/bin/python3 subversion-python"

inherit rpm
