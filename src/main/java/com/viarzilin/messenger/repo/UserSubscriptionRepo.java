package com.viarzilin.messenger.repo;

import com.viarzilin.messenger.domain.User;
import com.viarzilin.messenger.domain.UserSubscription;
import com.viarzilin.messenger.domain.UserSubscriptionId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserSubscriptionRepo extends JpaRepository<UserSubscription, UserSubscriptionId> {
    List<UserSubscription> findBySubscriber(User user);

    List<UserSubscription> findByChannel(User channel);

    UserSubscription findByChannelAndSubscriber(User userChannel, User subscriber);
}

