SUMMARY = "Google Spreadsheets Python API"
DESCRIPTION = "A Python module to access Google Spreadsheets. \
 \
Features \
-------- \
 \
* Google Sheets API v4. \
* Open a spreadsheet by its *title*, *url* or *key*. \
* Select cells by labels, e.g. 'A1'. \
* Extract range, entire row or column values. \
* Python 3 support."
LICENSE = "MIT"

PV = "5.7.2"

RPM_NAME = "python311-gspread-5.7.2-1.4.noarch.rpm"
RPM_HASH = "ee1e7744c0ad90d837a92c2dd74664bfc08a40551e2833d8a47f7615670396f764a7d554b72cedc7abea76641bc73e1bc317a1167a9ed77d01b5ae29fe39a961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(gspread) \
python311-gspread \
python3dist(gspread)"
RDEPENDS:${PN} += "python(abi) \
python311-google-auth \
python311-google-auth-oauthlib"

inherit rpm
