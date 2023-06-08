SUMMARY = "The openQA worker"
DESCRIPTION = "The openQA worker manages test engine (provided by os-autoinst package)."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1683294886.8a7e554"

RPM_NAME = "openQA-worker-4.6.1683294886.8a7e554-1.1.aarch64.rpm"
RPM_HASH = "c1ebcf1bb28e848e06bac50d2ad94d6a35b24296fff73b9dc58a793e0d7c5157eeb4fb97ce6e444aa0d51eb0476e7b6ed65bba369aebd621dc8b933eee24b171"

RPROVIDES:${PN} += "config(openQA-worker) group(_openqa-worker) openQA-worker openQA-worker(aarch-64) perl(OpenQA::CacheService::Client) perl(OpenQA::CacheService::Command::run) perl(OpenQA::CacheService::Controller::API) perl(OpenQA::CacheService::Controller::Influxdb) perl(OpenQA::CacheService::Model::Cache) perl(OpenQA::CacheService::Model::Downloads) perl(OpenQA::CacheService::Plugin::Helpers) perl(OpenQA::CacheService::Request) perl(OpenQA::CacheService::Request::Asset) perl(OpenQA::CacheService::Request::Sync) perl(OpenQA::CacheService::Response) perl(OpenQA::CacheService::Response::Info) perl(OpenQA::CacheService::Response::Status) perl(OpenQA::CacheService::Task::Asset) perl(OpenQA::CacheService::Task::Sync) perl(OpenQA::Worker::App) perl(OpenQA::Worker::CommandHandler) perl(OpenQA::Worker::Engines::isotovideo) perl(OpenQA::Worker::Isotovideo::Client) perl(OpenQA::Worker::Job) perl(OpenQA::Worker::Settings) perl(OpenQA::Worker::WebUIConnection) user(_openqa-worker)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/perl bsdtar coreutils group(nogroup) openQA-client openQA-common optipng os-autoinst perl(Capture::Tiny) perl(File::Map) perl(Minion::Backend::SQLite) perl(Mojo::IOLoop::ReadWriteProcess) perl(Mojo::SQLite) perl(SQL::SplitStatement) psmisc sqlite3"

inherit rpm
