SUMMARY = "Package manager for Node.js"
DESCRIPTION = "A package manager for Node.js that allows developers to install and \
publish packages to a package registry."
LICENSE = "MIT"

PV = "18.16.0"

RPM_NAME = "npm18-18.16.0-1.2.aarch64.rpm"
RPM_HASH = "c1238c1b29f2122ebcac219da3836b938e16293b92f418091fd9ff7b1354617b4189eabe06f756e21f1d95a77e51e07fa2d6cdfb2bea6aa641ae2affd06815ad"

RPROVIDES:${PN} += "bundled(node-abbrev) bundled(node-abort-controller) bundled(node-agent-base) bundled(node-agentkeepalive) bundled(node-aggregate-error) bundled(node-ansi-regex) bundled(node-ansi-styles) bundled(node-aproba) bundled(node-archy) bundled(node-are-we-there-yet) bundled(node-balanced-match) bundled(node-base64-js) bundled(node-bin-links) bundled(node-binary-extensions) bundled(node-brace-expansion) bundled(node-buffer) bundled(node-builtins) bundled(node-cacache) bundled(node-chalk) bundled(node-chownr) bundled(node-ci-info) bundled(node-cidr-regex) bundled(node-clean-stack) bundled(node-cli-columns) bundled(node-cli-table3) bundled(node-clone) bundled(node-cmd-shim) bundled(node-color-convert) bundled(node-color-name) bundled(node-color-support) bundled(node-columnify) bundled(node-common-ancestor-path) bundled(node-concat-map) bundled(node-console-control-strings) bundled(node-cssesc) bundled(node-debug) bundled(node-defaults) bundled(node-delegates) bundled(node-depd) bundled(node-diff) bundled(node-emoji-regex) bundled(node-encoding) bundled(node-env-paths) bundled(node-err-code) bundled(node-event-target-shim) bundled(node-events) bundled(node-fastest-levenshtein) bundled(node-fs-minipass) bundled(node-fs.realpath) bundled(node-function-bind) bundled(node-gauge) bundled(node-glob) bundled(node-graceful-fs) bundled(node-has) bundled(node-has-flag) bundled(node-has-unicode) bundled(node-hosted-git-info) bundled(node-http-cache-semantics) bundled(node-http-proxy-agent) bundled(node-https-proxy-agent) bundled(node-humanize-ms) bundled(node-iconv-lite) bundled(node-ieee754) bundled(node-ignore-walk) bundled(node-imurmurhash) bundled(node-indent-string) bundled(node-infer-owner) bundled(node-inflight) bundled(node-inherits) bundled(node-ini) bundled(node-init-package-json) bundled(node-ip) bundled(node-ip-regex) bundled(node-is-cidr) bundled(node-is-core-module) bundled(node-is-fullwidth-code-point) bundled(node-is-lambda) bundled(node-isexe) bundled(node-json-parse-even-better-errors) bundled(node-json-stringify-nice) bundled(node-jsonparse) bundled(node-just-diff) bundled(node-just-diff-apply) bundled(node-libnpmaccess) bundled(node-libnpmdiff) bundled(node-libnpmexec) bundled(node-libnpmfund) bundled(node-libnpmhook) bundled(node-libnpmorg) bundled(node-libnpmpack) bundled(node-libnpmpublish) bundled(node-libnpmsearch) bundled(node-libnpmteam) bundled(node-libnpmversion) bundled(node-lru-cache) bundled(node-make-fetch-happen) bundled(node-minimatch) bundled(node-minipass) bundled(node-minipass-collect) bundled(node-minipass-fetch) bundled(node-minipass-flush) bundled(node-minipass-json-stream) bundled(node-minipass-pipeline) bundled(node-minipass-sized) bundled(node-minizlib) bundled(node-mkdirp) bundled(node-ms) bundled(node-mute-stream) bundled(node-negotiator) bundled(node-node-gyp) bundled(node-nopt) bundled(node-normalize-package-data) bundled(node-npm-audit-report) bundled(node-npm-bundled) bundled(node-npm-install-checks) bundled(node-npm-normalize-package-bin) bundled(node-npm-package-arg) bundled(node-npm-packlist) bundled(node-npm-pick-manifest) bundled(node-npm-profile) bundled(node-npm-registry-fetch) bundled(node-npm-user-validate) bundled(node-npmlog) bundled(node-once) bundled(node-p-map) bundled(node-pacote) bundled(node-parse-conflict-json) bundled(node-path-is-absolute) bundled(node-postcss-selector-parser) bundled(node-proc-log) bundled(node-process) bundled(node-promise-all-reject-late) bundled(node-promise-call-limit) bundled(node-promise-inflight) bundled(node-promise-retry) bundled(node-promzard) bundled(node-qrcode-terminal) bundled(node-read) bundled(node-read-cmd-shim) bundled(node-read-package-json) bundled(node-read-package-json-fast) bundled(node-readable-stream) bundled(node-retry) bundled(node-rimraf) bundled(node-safe-buffer) bundled(node-safer-buffer) bundled(node-semver) bundled(node-set-blocking) bundled(node-signal-exit) bundled(node-sigstore) bundled(node-smart-buffer) bundled(node-socks) bundled(node-socks-proxy-agent) bundled(node-spdx-correct) bundled(node-spdx-exceptions) bundled(node-spdx-expression-parse) bundled(node-spdx-license-ids) bundled(node-ssri) bundled(node-string-width) bundled(node-string_decoder) bundled(node-strip-ansi) bundled(node-supports-color) bundled(node-tar) bundled(node-text-table) bundled(node-tiny-relative-date) bundled(node-treeverse) bundled(node-tuf-js) bundled(node-unique-filename) bundled(node-unique-slug) bundled(node-util-deprecate) bundled(node-validate-npm-package-license) bundled(node-validate-npm-package-name) bundled(node-walk-up-path) bundled(node-wcwidth) bundled(node-which) bundled(node-wide-align) bundled(node-wrappy) bundled(node-write-file-atomic) bundled(node-yallist) nodejs-npm npm npm(npm) npm18 npm18(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/env /usr/bin/node18 group(nobody) nodejs-common nodejs18 user(nobody)"

inherit rpm
