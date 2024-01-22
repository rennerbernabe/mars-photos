package fake

import fake.example.marsphotos.network.MarsApiService
import fake.example.marsphotos.network.MarsPhoto

class FakeMarsApiService: MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}
